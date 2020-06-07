.PHONY: repl

repl:
	clj -m nrepl.cmdline --middleware '["cider.nrepl/cider-middleware"]'
