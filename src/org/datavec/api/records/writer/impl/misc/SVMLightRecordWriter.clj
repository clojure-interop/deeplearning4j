(ns org.datavec.api.records.writer.impl.misc.SVMLightRecordWriter
  "Record writer for SVMLight format, which can generally
 be described as
 LABEL INDEX:VALUE INDEX:VALUE ...
 SVMLight format is well-suited to sparse data (e.g.,
 bag-of-words) because it omits all features with value
 zero.
 We support an \"extended\" version that allows for multiple
 targets (or labels) separated by a comma, as follows:
 LABEL1,LABEL2,... INDEX:VALUE INDEX:VALUE ...
 This can be used to represent either multitask problems or
 multilabel problems with sparse binary labels (controlled
 via the \"MULTILABEL\" configuration option).
 Like scikit-learn, we support both zero-based and one-based indexing.
 Further details on the format can be found at
 - http://svmlight.joachims.org/
 - http://www.csie.ntu.edu.tw/~cjlin/libsvmtools/datasets/multilabel.html
 - http://scikit-learn.org/stable/modules/generated/sklearn.datasets.load_svmlight_file.html"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.writer.impl.misc SVMLightRecordWriter]))

(defn ->svm-light-record-writer
  "Constructor."
  (^SVMLightRecordWriter []
    (new SVMLightRecordWriter )))

(def *-name-space
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/NAME_SPACE)

(def *-feature-first-column
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/FEATURE_FIRST_COLUMN)

(def *-feature-last-column
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/FEATURE_LAST_COLUMN)

(def *-zero-based-indexing
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/ZERO_BASED_INDEXING)

(def *-zero-based-label-indexing
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/ZERO_BASED_LABEL_INDEXING)

(def *-has-labels
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/HAS_LABELS)

(def *-multilabel
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/MULTILABEL)

(def *-label-first-column
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/LABEL_FIRST_COLUMN)

(def *-label-last-column
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/LABEL_LAST_COLUMN)

(def *-unlabeled
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordWriter/UNLABELED)

(defn set-conf
  "Set DataVec configuration

  conf - `org.datavec.api.conf.Configuration`"
  ([^SVMLightRecordWriter this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn write
  "Write next record.

  record - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^SVMLightRecordWriter this ^java.util.List record]
    (-> this (.write record))))

