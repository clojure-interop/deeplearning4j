(ns org.deeplearning4j.rl4j.mdp.gym.ActionTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.gym ActionTransformer]))

(defn ->action-transformer
  "Constructor.

  hld - `org.deeplearning4j.rl4j.space.HighLowDiscrete`
  available-action - `int[]`"
  (^ActionTransformer [^org.deeplearning4j.rl4j.space.HighLowDiscrete hld available-action]
    (new ActionTransformer hld available-action)))

(defn encode
  "a - `java.lang.Integer`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ActionTransformer this ^java.lang.Integer a]
    (-> this (.encode a))))

