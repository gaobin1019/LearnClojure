(ns helloworld.core)

(defn factorial-bigint-loop [n]
    (if (= n 0) 1
        (loop [val n i n]
            (if (<= i 1) val
                (recur (*' val (dec i)) (dec i))))))

(defn -main
  "I can say 'Hello World'."
  []
  (println (factorial-bigint-loop 20)))
