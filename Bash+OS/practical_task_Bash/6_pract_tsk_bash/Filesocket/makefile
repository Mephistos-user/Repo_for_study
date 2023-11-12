

CC = g++

.PHONY: all 
all: server0.out server1.out client.out

%.out: %.cpp
	$(CC) -o $@ $^
	
clean:
	rm -rf *.out *.soc