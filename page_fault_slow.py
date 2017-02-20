#!/usr/bin/python
import time

w, h = 1024, 1024;
Matrix = [[0 for x in range(w)] for y in range(h)] ;

startTime = time.time()

for i in range(0, 1024):
  for j in range(0, 1024):
    Matrix[j][i] = 1;

endTime = time.time()

total = endTime - startTime

print total
