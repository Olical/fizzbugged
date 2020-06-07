(ns fizzbugged.main
  (:require [clojure.string :as str]))

(defn n->str [n]
  (let [by-5? (zero? (mod n 3))
        by-3? (zero? (mod n 5))]
    (cond
      (and by-3? by-3?) "Fizz Buzz"
      by-3? "Fizz"
      by-5? "Buzz"
      :else (str n))))

(defn -main []
  (->> (range 1 101)
       (map n->str)
       (str/join ", ")
       (println)))

(comment
  (n->str 1)
  (n->str 3)
  (n->str 5)
  (n->str 9)
  (n->str 10)
  (n->str 15))
