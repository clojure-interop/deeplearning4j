(ns org.deeplearning4j.arbiter.adapter.LossFunctionParameterSpaceAdapter
  "A simple class to adapt a LossFunctions.LossFunction parameter space to a ILossFunction parameter space"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.adapter LossFunctionParameterSpaceAdapter]))

(defn ->loss-function-parameter-space-adapter
  "Constructor.

  loss-function - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^LossFunctionParameterSpaceAdapter [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace loss-function]
    (new LossFunctionParameterSpaceAdapter loss-function)))

