(ns org.nd4j.linalg.env.impl.OmpNumThreadsAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl OmpNumThreadsAction]))

(defn ->omp-num-threads-action
  "Constructor."
  (^OmpNumThreadsAction []
    (new OmpNumThreadsAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^OmpNumThreadsAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^OmpNumThreadsAction this ^java.lang.String value]
    (-> this (.process value))))

