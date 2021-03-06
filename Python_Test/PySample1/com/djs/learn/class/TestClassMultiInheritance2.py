'''
Created on Apr 13, 2016

@author: dj
'''

from pprint import pprint


class ProductBase(object):

    def __init__(self, char_id):
        self.char_id = char_id
        print("ProductBase:char_id = {}".format(
            self.char_id))


class ProductImplA(ProductBase):

    def __init__(self, char_id):
        print("ProductImplA:char_id = {}".format(
            char_id))
        super().__init__(char_id + "a")
        print("ProductImplA:self.char_id = {}".format(
            self.char_id))
        self.char_id += "a"
        print("ProductImplA:self.char_id = {}".format(
            self.char_id))


class ProductImplB(ProductBase):

    def __init__(self, char_id):
        print("ProductImplB:char_id = {}".format(
            char_id))
        super().__init__(char_id + "b")
        print("ProductImplB:self.char_id = {}".format(
            self.char_id))
        self.char_id += "b"
        print("ProductImplB:self.char_id = {}".format(
            self.char_id))


class ProductFinalA(ProductImplA, ProductImplB):

    def __init__(self, char_id):
        print("ProductFinalA:char_id = {}".format(
            char_id))
        super().__init__(char_id + "f")
        print("ProductFinalA:self.char_id = {}".format(
            self.char_id))
        self.char_id += "f"
        print("ProductFinalA:self.char_id = {}".format(
            self.char_id))


class ProductFinalB(ProductImplB, ProductImplA):

    def __init__(self, char_id):
        print("ProductFinalB:char_id = {}".format(
            char_id))
        super().__init__(char_id + "g")
        print("ProductFinalB:self.char_id = {}".format(
            self.char_id))
        self.char_id += "g"
        print("ProductFinalB:self.char_id = {}".format(
            self.char_id))


print("-" * 40)

pprint(ProductFinalA.mro())
pprint(ProductFinalB.mro())

print("-" * 40)

product1 = ProductFinalA("1")
print("product1.char_id = {}".format(product1.char_id))

print("-" * 40)

product2 = ProductFinalB("2")
print("product2.char_id = {}".format(product2.char_id))

print("-" * 40)


if __name__ == '__main__':
    pass
