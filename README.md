# Shamir-Secret-Sharing-Code-
Shamir Secret Sharing Code with JSON Input Parsing and BigInteger Conversion
**OutPut** -
Processing file 1:
x: 1, y: 4
x: 2, y: 7
x: 3, y: 12
x: 6, y: 39
Processing file 2:
x: 1, y: 995085094601491
x: 2, y: 21394886326566393
x: 3, y: 196563650089608567
x: 4, y: 1016509518118225951
x: 5, y: 3711974121218449851
x: 6, y: 10788619898233492461
x: 7, y: 26709394976508342463
x: 8, y: 58725075613853308713
x: 9, y: 117852986202006511971
x: 10, y: 220003896831595324801



This Java code implements Shamir's Secret Sharing scheme using Lagrange interpolation. The program reads test cases from JSON files containing points, where each point is represented as an (x, y) pair. Values are stored in various bases and converted to BigInteger based on the specified base before processing. This ensures accurate handling of large numbers required for cryptographic calculations.
