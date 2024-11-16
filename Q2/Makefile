SRC=.
BIN=.

CIBLES=TestDIL

CC=javac
CFLAGS=-d $(BIN) -classpath $(BIN)

all: $(CIBLES)

TestDIL: $(BIN)/TestDIL.class

$(BIN)/TestDIL.class: $(BIN)/%.class: $(SRC)/%.java $(BIN)/DIL.class
	$(CC) $< -d $(BIN)

$(BIN)/DIL.class: $(BIN)/%.class: $(SRC)/%.java $(BIN)/Semaphore.class
	$(CC) $< -d $(BIN)

$(BIN)/Semaphore.class: $(BIN)/%.class: $(SRC)/%.java
	$(CC) $< -d $(BIN)

clean:
	rm $(BIN)/*.class
