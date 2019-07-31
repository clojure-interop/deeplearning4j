(ns org.deeplearning4j.arbiter.adapter.ActivationParameterSpaceAdapter
  "A simple class to adapt a Activation parameter space to a IActivation parameter space"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.adapter ActivationParameterSpaceAdapter]))

(defn ->activation-parameter-space-adapter
  "Constructor.

  activation - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^ActivationParameterSpaceAdapter [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace activation]
    (new ActivationParameterSpaceAdapter activation)))

(defn convert-value
  "from - `org.nd4j.linalg.activations.Activation`

  returns: `org.nd4j.linalg.activations.IActivation`"
  (^org.nd4j.linalg.activations.IActivation [^ActivationParameterSpaceAdapter this ^org.nd4j.linalg.activations.Activation from]
    (-> this (.convertValue from))))

