(ns org.deeplearning4j.spark.api.TrainingHook
  "A hook for the workers when training.
 A pre update and post update method are specified
 for when certain information needs to be collected
 or there needs to be specific parameters
 or models sent to remote locations for visualization
 or other things."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api TrainingHook]))

(defn pre-update
  "A hook method for pre update.

  minibatch - the inibatchthat was used for the update - `org.nd4j.linalg.dataset.api.DataSet`
  model - themodel that was update - `org.deeplearning4j.nn.api.Model`"
  ([^TrainingHook this ^org.nd4j.linalg.dataset.api.DataSet minibatch ^org.deeplearning4j.nn.api.Model model]
    (-> this (.preUpdate minibatch model))))

(defn post-update
  "A hook method for post update

  minibatch - the minibatchthat was usd for the update - `org.nd4j.linalg.dataset.api.DataSet`
  model - the model that was updated - `org.deeplearning4j.nn.api.Model`"
  ([^TrainingHook this ^org.nd4j.linalg.dataset.api.DataSet minibatch ^org.deeplearning4j.nn.api.Model model]
    (-> this (.postUpdate minibatch model))))

