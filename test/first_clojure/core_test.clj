(ns first-clojure.core-test
  (:require [clojure.test :refer :all]
            [first-clojure.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest a-test-2
  (testing "test core"
    (is (foo 1) 1)))