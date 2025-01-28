import math # 5 вариант
x = -15.246
y = 4.642e-2
z = 21
pervchast = math.log(y ** -math.sqrt(abs(x))) * (x - y / 2)
vtorchast = (math.sin(math.atan(z))) ** 2
s = pervchast + vtorchast
print("s =", s)