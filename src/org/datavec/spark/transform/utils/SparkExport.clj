(ns org.datavec.spark.transform.utils.SparkExport
  "Created by Alex on 7/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.utils SparkExport]))

(defn ->spark-export
  "Constructor."
  (^SparkExport []
    (new SparkExport )))

(defn *export-csv-spark
  "directory - `java.lang.String`
  delimiter - `java.lang.String`
  quote - `java.lang.String`
  output-splits - `int`
  data - `org.apache.spark.api.java.JavaRDD`"
  ([^java.lang.String directory ^java.lang.String delimiter ^java.lang.String quote ^Integer output-splits ^org.apache.spark.api.java.JavaRDD data]
    (SparkExport/exportCSVSpark directory delimiter quote output-splits data))
  ([^java.lang.String directory ^java.lang.String delimiter ^Integer output-splits ^org.apache.spark.api.java.JavaRDD data]
    (SparkExport/exportCSVSpark directory delimiter output-splits data)))

(defn *export-csv-local
  "output-dir - `java.lang.String`
  base-file-name - `java.lang.String`
  num-files - `int`
  delimiter - `java.lang.String`
  quote - `java.lang.String`
  data - `org.apache.spark.api.java.JavaRDD`
  rng-seed - `int`

  throws: java.lang.Exception"
  ([^java.lang.String output-dir ^java.lang.String base-file-name ^Integer num-files ^java.lang.String delimiter ^java.lang.String quote ^org.apache.spark.api.java.JavaRDD data ^Integer rng-seed]
    (SparkExport/exportCSVLocal output-dir base-file-name num-files delimiter quote data rng-seed))
  ([^java.lang.String output-dir ^java.lang.String base-file-name ^Integer num-files ^java.lang.String delimiter ^org.apache.spark.api.java.JavaRDD data ^Integer rng-seed]
    (SparkExport/exportCSVLocal output-dir base-file-name num-files delimiter data rng-seed))
  ([^java.io.File output-file ^java.lang.String delimiter ^java.lang.String quote ^org.apache.spark.api.java.JavaRDD data ^Integer rng-seed]
    (SparkExport/exportCSVLocal output-file delimiter quote data rng-seed))
  ([^java.io.File output-file ^java.lang.String delimiter ^org.apache.spark.api.java.JavaRDD data ^Integer rng-seed]
    (SparkExport/exportCSVLocal output-file delimiter data rng-seed)))

(defn *export-string-local
  "output-file - `java.io.File`
  data - `org.apache.spark.api.java.JavaRDD`
  rng-seed - `int`

  throws: java.lang.Exception"
  ([^java.io.File output-file ^org.apache.spark.api.java.JavaRDD data ^Integer rng-seed]
    (SparkExport/exportStringLocal output-file data rng-seed)))

(defn *export-csv-sequence-local
  "base-dir - `java.io.File`
  sequences - `org.apache.spark.api.java.JavaRDD`
  seed - `long`

  throws: java.lang.Exception"
  ([^java.io.File base-dir ^org.apache.spark.api.java.JavaRDD sequences ^Long seed]
    (SparkExport/exportCSVSequenceLocal base-dir sequences seed)))

(defn *export-csv-sequence-local-no-shuffling
  "base-dir - `java.io.File`
  sequences - `org.apache.spark.api.java.JavaRDD`
  delimiter - `java.lang.String`
  file-prefix - `java.lang.String`
  file-extension - `java.lang.String`

  throws: java.lang.Exception"
  ([^java.io.File base-dir ^org.apache.spark.api.java.JavaRDD sequences ^java.lang.String delimiter ^java.lang.String file-prefix ^java.lang.String file-extension]
    (SparkExport/exportCSVSequenceLocalNoShuffling base-dir sequences delimiter file-prefix file-extension))
  ([^java.io.File base-dir ^org.apache.spark.api.java.JavaRDD sequences]
    (SparkExport/exportCSVSequenceLocalNoShuffling base-dir sequences)))

