(ns org.nd4j.linalg.dataset.BalanceMinibatches
  "Auto balance mini batches by label."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset BalanceMinibatches]))

(defn ->balance-minibatches
  "Constructor."
  (^BalanceMinibatches []
    (new BalanceMinibatches )))

(defn balance
  "Generate a balanced
  dataset minibatch fileset."
  ([^BalanceMinibatches this]
    (-> this (.balance))))

