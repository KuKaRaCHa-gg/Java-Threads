SRC=src
BIN=bin

CIBLES= TestVoieUniqueSansSynchro TestVoieUniqueAvecSynchro

PACKAGE= $(BIN)/threads/train

CC=javac
CFLAGS=-d $(BIN) -classpath $(BIN)

all: $(CIBLES)

TestVoieUniqueSansSynchro: $(BIN)/TestVoieUniqueSansSynchro.class

TestVoieUniqueAvecSynchro: $(BIN)/TestVoieUniqueAvecSynchro.class

$(BIN)/TestVoieUniqueSansSynchro.class: $(BIN)/%.class: $(SRC)/%.java $(PACKAGE)/Train.class $(PACKAGE)/VoieUniqueSansSynchro.class
	$(CC) $< -d $(BIN)

$(BIN)/TestVoieUniqueAvecSynchro.class: $(BIN)/%.class: $(SRC)/%.java $(PACKAGE)/Train.class $(PACKAGE)/VoieUniqueAvecSynchro.class
	$(CC) $< -d $(BIN)

$(PACKAGE)/Train.class: $(PACKAGE)/%.class: $(SRC)/%.java $(PACKAGE)/VoieUnique.class
	$(CC) $< -d $(BIN)

$(PACKAGE)/VoieUniqueSansSynchro.class \
$(PACKAGE)/VoieUniqueAvecSynchro.class: $(PACKAGE)/%.class: $(SRC)/%.java $(PACKAGE)/VoieUnique.class
	$(CC) $< -d $(BIN)

$(PACKAGE)/VoieUnique.class: $(PACKAGE)/%.class: $(SRC)/%.java $(PACKAGE)/MauvaiseVoieException.class
	$(CC) $< -d $(BIN)

$(PACKAGE)/MauvaiseVoieException.class: $(PACKAGE)/%.class: $(SRC)/%.java
	$(CC) $< -d $(BIN)

clean:
	rm $(PACKAGE)/*.class
	rm $(BIN)/*.class
