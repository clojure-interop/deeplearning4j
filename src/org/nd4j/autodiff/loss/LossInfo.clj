(ns org.nd4j.autodiff.loss.LossInfo
  "Information and variables for a loss function. Used with LossFunctions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.loss LossInfo]))

(defn ->loss-info
  "Constructor."
  (^LossInfo []
    (new LossInfo )))

