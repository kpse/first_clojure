(ns first-clojure.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!")
  x)

(defn -main [& args](foo args[0]))
