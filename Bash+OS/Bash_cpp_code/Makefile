#
#
#
.DEFAULT_GOAL := 1_process.cpp

all: clean test
1_process.cpp:
	gss -o 1_process.out 1_process.cpp

run: 1_process.cpp
	1_process.out 1

test: 1_process.cpp
	1_process.out 10

clean:
	rm -rf *.out