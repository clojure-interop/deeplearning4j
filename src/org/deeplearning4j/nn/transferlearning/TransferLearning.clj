(ns org.deeplearning4j.nn.transferlearning.TransferLearning
  "The transfer learning API can be used to modify the architecture or the learning parameters of an existing multilayernetwork or computation graph.
 It allows one to
 - change nOut of an existing layer
 - remove and add existing layers/vertices
 - fine tune learning configuration (learning rate, updater etc)
 - hold parameters for specified layers as a constant"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.transferlearning TransferLearning]))

(defn ->transfer-learning
  "Constructor."
  (^TransferLearning []
    (new TransferLearning )))

