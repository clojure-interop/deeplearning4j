(ns org.datavec.spark.transform.ImageSparkTransform
  "Created by kepricon on 17. 5. 24."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform ImageSparkTransform]))

(defn ->image-spark-transform
  "Constructor."
  (^ImageSparkTransform []
    (new ImageSparkTransform )))

(defn to-array
  "record - `org.datavec.spark.transform.model.SingleImageRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`

  throws: java.io.IOException"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^ImageSparkTransform this ^org.datavec.spark.transform.model.SingleImageRecord record]
    (-> this (.toArray record))))

