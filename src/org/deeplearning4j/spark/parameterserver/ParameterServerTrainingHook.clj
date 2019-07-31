(ns org.deeplearning4j.spark.parameterserver.ParameterServerTrainingHook
  "Training hook for the
 parameter server"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver ParameterServerTrainingHook]))

(defn ->parameter-server-training-hook
  "Constructor."
  (^ParameterServerTrainingHook []
    (new ParameterServerTrainingHook )))

(defn pre-update
  "A hook method for pre update.

  minibatch - the inibatchthat was used for the update - `org.nd4j.linalg.dataset.api.DataSet`
  model - themodel that was update - `org.deeplearning4j.nn.api.Model`"
  ([^ParameterServerTrainingHook this ^org.nd4j.linalg.dataset.api.DataSet minibatch ^org.deeplearning4j.nn.api.Model model]
    (-> this (.preUpdate minibatch model))))

(defn post-update
  "A hook method for post update

  minibatch - the minibatchthat was usd for the update - `org.nd4j.linalg.dataset.api.DataSet`
  model - the model that was updated - `org.deeplearning4j.nn.api.Model`"
  ([^ParameterServerTrainingHook this ^org.nd4j.linalg.dataset.api.DataSet minibatch ^org.deeplearning4j.nn.api.Model model]
    (-> this (.postUpdate minibatch model))))

