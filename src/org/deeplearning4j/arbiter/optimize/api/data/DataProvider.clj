(ns org.deeplearning4j.arbiter.optimize.api.data.DataProvider
  "Deprecated.
 Use DataSource"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.data DataProvider]))

(defn train-data
  "Deprecated.

  data-parameters - Parameters for data. May be null or empty for default data - `java.util.Map`

  returns: training data - `java.lang.Object`"
  (^java.lang.Object [^DataProvider this ^java.util.Map data-parameters]
    (-> this (.trainData data-parameters))))

(defn test-data
  "Deprecated.

  data-parameters - Parameters for data. May be null or empty for default data - `java.util.Map`

  returns: training data - `java.lang.Object`"
  (^java.lang.Object [^DataProvider this ^java.util.Map data-parameters]
    (-> this (.testData data-parameters))))

(defn get-data-type
  "Deprecated.

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^DataProvider this]
    (-> this (.getDataType))))

