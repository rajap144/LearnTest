#!/bin/bash

# USER_PROFILE: [1: Seller, 2: Buyer]
# The data is same. Can fix to use 1.
USER_PROFILE=$1
# PROPERTY_TYPE:
# 01: 1-Room
# 02: 2-Room
# 03: 3-Room
# 04: 4-Room
# 05: 5-Room
# 06: Executive
# 08: Multi-Generation
FLAT_TYPE=$2
# DATE_RANGE:
# 6 : Last 6 month
# 12: Last 12 month
DATE_RANGE=$3
OUTPUT_FOLDER=$4
OUTPUT_FILE_PREFIX=$5

echo "------------------------------------------------------------"
echo "USER_PROFILE = "$USER_PROFILE
echo "FLAT_TYPE = "$FLAT_TYPE
echo "DATE_RANGE = "$DATE_RANGE
echo "OUTPUT_FOLDER = "$OUTPUT_FOLDER
echo "OUTPUT_FILE_PREFIX = "$OUTPUT_FILE_PREFIX

if [ "$USER_PROFILE" != "1" ]; then
	if [ "$USER_PROFILE" != "2" ]; then
		echo "Error: USER_PROFILE wrong!"
		exit -1
	fi
fi

if [ "$FLAT_TYPE" != "01" ]; then
	if [ "$FLAT_TYPE" != "02" ]; then
		if [ "$FLAT_TYPE" != "03" ]; then
			if [ "$FLAT_TYPE" != "04" ]; then
				if [ "$FLAT_TYPE" != "05" ]; then
					if [ "$FLAT_TYPE" != "06" ]; then
						if [ "$FLAT_TYPE" != "08" ]; then
							echo "Error: FLAT_TYPE wrong!"
							exit -1
						fi
					fi
				fi
			fi
		fi
	fi
fi

if [ "$DATE_RANGE" != "6" ]; then
	if [ "$DATE_RANGE" != "12" ]; then
		echo "Error: DATE_RANGE wrong!"
		exit -1
	fi
fi

TOWN_LIST=()
TOWN_LIST+=('AMK+++++Ang+Mo+Kio')
TOWN_LIST+=('BD++++++Bedok')
TOWN_LIST+=('BH++++++Bishan')
TOWN_LIST+=('BB++++++Bukit+Batok')
TOWN_LIST+=('BM++++++Bukit+Merah')
TOWN_LIST+=('BP++++++Bukit+Panjang')
TOWN_LIST+=('BT++++++Bukit+Timah')
TOWN_LIST+=('CT++++++Central+Area')
TOWN_LIST+=('CCK+++++Choa+Chu+Kang')
TOWN_LIST+=('CL++++++Clementi')
TOWN_LIST+=('GL++++++Geylang')
TOWN_LIST+=('HG++++++Hougang')
TOWN_LIST+=('JE++++++Jurong+East')
TOWN_LIST+=('JW++++++Jurong+West')
TOWN_LIST+=('KWN+++++Kallang/Whampoa')
TOWN_LIST+=('MP++++++Marine+Parade')
TOWN_LIST+=('PRC+++++Pasir+Ris')
TOWN_LIST+=('PG++++++Punggol')
TOWN_LIST+=('QT++++++Queenstown')
TOWN_LIST+=('SB++++++Sembawang')
TOWN_LIST+=('SK++++++Sengkang')
TOWN_LIST+=('SGN+++++Serangoon')
TOWN_LIST+=('TAP+++++Tampines')
TOWN_LIST+=('TG++++++Tengah')
TOWN_LIST+=('TP++++++Toa+Payoh')
TOWN_LIST+=('WL++++++Woodlands')
TOWN_LIST+=('YS++++++Yishun')

echo "TOWN_LIST = "${#TOWN_LIST[@]}
# echo "TOWN_LIST = ""${TOWN_LIST[@]}"

make_form_data_full()
{
	L_NME_NEWTOWN=$1
	L_FORM_DATA_FULL="USER_PROFILE=${USER_PROFILE}&FLAT_TYPE=${FLAT_TYPE}&NME_NEWTOWN=${L_NME_NEWTOWN}&NME_STREET=&NUM_BLK_FROM=&NUM_BLK_TO=&dteRange=${DATE_RANGE}&DTE_APPROVAL_FROM=&DTE_APPROVAL_TO=&AMT_RESALE_PRICE_FROM=&AMT_RESALE_PRICE_TO=&Process=continue&null=null"
	echo  $L_FORM_DATA_FULL
}

echo "#!/bin/bash" > ${OUTPUT_FOLDER}/${OUTPUT_FILE_PREFIX}.sh
echo >> ${OUTPUT_FOLDER}/${OUTPUT_FILE_PREFIX}.sh

ACTION_URL="https://services2.hdb.gov.sg/webapp/BB33RTIS/BB33SSearchWidget"
REFERER_URL="https://services2.hdb.gov.sg/webapp/BB33RTIS/BB33PReslTrans.jsp"
echo "ACTION_URL = "$ACTION_URL
echo "REFERER_URL = "$REFERER_URL

N=1
for TOWN_NAME in "${TOWN_LIST[@]}"
do
	echo $N": TOWN_NAME = "$TOWN_NAME

	JSESSIONIDP1=$(curl -sSv --location "${REFERER_URL}" --compressed 2>&1 | grep JSESSIONIDP1 | cut -d' ' -f3 | cut -d= -f2 | tr -d ';')
	echo $N": JSESSIONIDP1 = "$JSESSIONIDP1

	FORM_DATA_FULL=$(make_form_data_full ${TOWN_NAME})
	echo $N": FORM_DATA_FULL = "$FORM_DATA_FULL

    # Save data.
	ACTION_COMMAND="curl -sS --location '${ACTION_URL}' -H 'Referer: ${REFERER_URL}' -H 'Cookie: JSESSIONIDP1=${JSESSIONIDP1}' -H 'Content-Type: application/x-www-form-urlencoded' -d '${FORM_DATA_FULL}' --compressed -o '${OUTPUT_FILE_PREFIX}_${N}.html' &"
	echo $N": ACTION_COMMAND = "$ACTION_COMMAND
	echo $ACTION_COMMAND >> ${OUTPUT_FOLDER}/${OUTPUT_FILE_PREFIX}.sh
	echo >> ${OUTPUT_FOLDER}/${OUTPUT_FILE_PREFIX}.sh

	N=$(($N + 1))
done

echo "------------------------------------------------------------"
