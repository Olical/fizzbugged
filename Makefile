.PHONY: repl

repl:
	clojure -m nrepl.cmdline --middleware '["cider.nrepl/cider-middleware"]'

run:
	clojure -m fizzbugged.main
