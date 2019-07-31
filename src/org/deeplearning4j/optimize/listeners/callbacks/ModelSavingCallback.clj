(ns org.deeplearning4j.optimize.listeners.callbacks.ModelSavingCallback
  "This callback will save model after each EvaluativeListener invocation.
 Filename template respects %d pattern, which will be replaced with integer value representing invocation number (not iteration!).
 I.e. if EvaluativeListener has frequency set to 50, it will be invoked once every 50 iterations, each invocation will increment number by 1. So, after 500 epochs there will be 10 invocations in total, and 10 models will be saved.
 PLEASE NOTE:"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners.callbacks ModelSavingCallback]))

(defn ->model-saving-callback
  "Constructor.

  This constructor will create ModelSavingCallback instance that will save models in specified folder
  PLEASE NOTE: Make sure you have write access to the target folder

  root-folder - File object referring to target folder - `java.io.File`
  file-name-template - `java.lang.String`"
  (^ModelSavingCallback [^java.io.File root-folder ^java.lang.String file-name-template]
    (new ModelSavingCallback root-folder file-name-template))
  (^ModelSavingCallback [^java.lang.String file-name-template]
    (new ModelSavingCallback file-name-template)))

(defn call
  "listener - `org.deeplearning4j.optimize.listeners.EvaluativeListener`
  model - `org.deeplearning4j.nn.api.Model`
  invocations-count - `long`
  evaluations - `org.deeplearning4j.eval.IEvaluation[]`"
  ([^ModelSavingCallback this ^org.deeplearning4j.optimize.listeners.EvaluativeListener listener ^org.deeplearning4j.nn.api.Model model ^Long invocations-count evaluations]
    (-> this (.call listener model invocations-count evaluations))))

