.PHONY: app
app:
	make -C app

.PHONY: root
root:
	make -C root

.PHONY: all
all: app root

.PHONY: run
run: app root
	cd root && java Main

.PHONY: clean
clean:
	make -C app clean
	make -C root clean
