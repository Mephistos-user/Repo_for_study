

CC = g++

.PHONY: all 
all: server.out client.out

%.out: %.cpp
	$(CC) -o $@ $^

clean:
	rm -rf *.out