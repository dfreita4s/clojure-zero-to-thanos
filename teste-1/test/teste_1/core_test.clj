(ns teste-1.core-test
  (:require [clojure.test :refer :all]
            [teste-1.core :refer :all]))

(deftest taxa-de-entrega-test
  (testing "taxa de entrega valor menor que 100"
    (is (= 15 (taxa-de-entrega 10))
        (= 15 (taxa-de-entrega 99.9))))
  (testing "taxa de entrega valor entre 100 e 200"
    (is (= 5 (taxa-de-entrega 100))
        (= 5 (taxa-de-entrega 200))))
  (testing "taxa de entrega valor maior que 200"
    (is (= 0 (taxa-de-entrega 200.01))
        (= 0 (taxa-de-entrega 321321)))))

