(ns org.deeplearning4j.optimize.listeners.callbacks.EvaluationCallback
  "This interface describes callback, which can be used with EvaluativeListener, to extend its functionality.
 PLEASE NOTE: This callback will be invoked AFTER evaluation finished for all evaluators."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners.callbacks EvaluationCallback]))

(defn call
  "listener - `org.deeplearning4j.optimize.listeners.EvaluativeListener`
  model - `org.deeplearning4j.nn.api.Model`
  invocations-count - `long`
  evaluations - `org.deeplearning4j.eval.IEvaluation[]`"
  ([^EvaluationCallback this ^org.deeplearning4j.optimize.listeners.EvaluativeListener listener ^org.deeplearning4j.nn.api.Model model ^Long invocations-count evaluations]
    (-> this (.call listener model invocations-count evaluations))))

