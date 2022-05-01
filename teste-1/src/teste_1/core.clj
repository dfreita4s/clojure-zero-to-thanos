(ns teste-1.core)

;; tdd
;; tests

(defn taxa-de-entrega
  "valor < 100, entrega 15
  100<=valor<200, entrega 5
  valor<=200, entrega 0"
  [valor-compra]
  (if (< valor-compra 100)
      15
      (if (< valor-compra 200)
        5
        0)))

