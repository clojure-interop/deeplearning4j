(ns org.deeplearning4j.parallelism.main.ParallelWrapperMain
  "Parallelwrapper main class.
 Configure a ParallelWrapper
 instance from the command line."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.main ParallelWrapperMain]))

(defn ->parallel-wrapper-main
  "Constructor."
  (^ParallelWrapperMain []
    (new ParallelWrapperMain )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (ParallelWrapperMain/main args)))

(defn run-main
  "args - `java.lang.String`

  throws: java.lang.Exception"
  ([^ParallelWrapperMain this ^java.lang.String args]
    (-> this (.runMain args))))

(defn run
  "throws: java.lang.Exception"
  ([^ParallelWrapperMain this]
    (-> this (.run))))

