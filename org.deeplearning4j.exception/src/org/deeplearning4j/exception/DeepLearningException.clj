(ns org.deeplearning4j.exception.DeepLearningException
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.exception DeepLearningException]))

(defn ->deep-learning-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`
  enable-suppression - `boolean`
  writable-stack-trace - `boolean`"
  (^DeepLearningException [^java.lang.String message ^java.lang.Throwable cause ^Boolean enable-suppression ^Boolean writable-stack-trace]
    (new DeepLearningException message cause enable-suppression writable-stack-trace))
  (^DeepLearningException [^java.lang.String message ^java.lang.Throwable cause]
    (new DeepLearningException message cause))
  (^DeepLearningException [^java.lang.String message]
    (new DeepLearningException message))
  (^DeepLearningException []
    (new DeepLearningException )))

