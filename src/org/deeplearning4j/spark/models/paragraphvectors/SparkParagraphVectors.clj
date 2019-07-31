(ns org.deeplearning4j.spark.models.paragraphvectors.SparkParagraphVectors
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.paragraphvectors SparkParagraphVectors]))

(defn fit-multiple-files
  "This method builds ParagraphVectors model, expecting JavaPairRDD with key as label, and value as document-in-a-string.

  documents-rdd - `org.apache.spark.api.java.JavaPairRDD`"
  ([^SparkParagraphVectors this ^org.apache.spark.api.java.JavaPairRDD documents-rdd]
    (-> this (.fitMultipleFiles documents-rdd))))

(defn fit-labelled-documents
  "This method builds ParagraphVectors model, expecting JavaRDD.
  It can be either non-tokenized documents, or tokenized.

  documents-rdd - `org.apache.spark.api.java.JavaRDD`"
  ([^SparkParagraphVectors this ^org.apache.spark.api.java.JavaRDD documents-rdd]
    (-> this (.fitLabelledDocuments documents-rdd))))

