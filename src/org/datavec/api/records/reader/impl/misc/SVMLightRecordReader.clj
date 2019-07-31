(ns org.datavec.api.records.reader.impl.misc.SVMLightRecordReader
  "Record reader for SVMLight format, which can generally
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
  (:import [org.datavec.api.records.reader.impl.misc SVMLightRecordReader]))

(defn ->svm-light-record-reader
  "Constructor."
  (^SVMLightRecordReader []
    (new SVMLightRecordReader )))

(def *-name-space
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/NAME_SPACE)

(def *-num-features
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/NUM_FEATURES)

(def *-zero-based-indexing
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/ZERO_BASED_INDEXING)

(def *-zero-based-label-indexing
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/ZERO_BASED_LABEL_INDEXING)

(def *-multilabel
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/MULTILABEL)

(def *-num-labels
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/NUM_LABELS)

(def *-comment-char
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/COMMENT_CHAR)

(def *-allowed-delimiters
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/ALLOWED_DELIMITERS)

(def *-preferred-delimiter
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/PREFERRED_DELIMITER)

(def *-feature-delimiter
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/FEATURE_DELIMITER)

(def *-label-delimiter
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/LABEL_DELIMITER)

(def *-qid-prefix
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/QID_PREFIX)

(def *-zero
  "Static Constant.

  type: org.datavec.api.writable.Writable"
  SVMLightRecordReader/ZERO)

(def *-one
  "Static Constant.

  type: org.datavec.api.writable.Writable"
  SVMLightRecordReader/ONE)

(def *-label-zero
  "Static Constant.

  type: org.datavec.api.writable.Writable"
  SVMLightRecordReader/LABEL_ZERO)

(def *-label-one
  "Static Constant.

  type: org.datavec.api.writable.Writable"
  SVMLightRecordReader/LABEL_ONE)

(def *-num-attributes
  "Static Constant.

  type: java.lang.String"
  SVMLightRecordReader/NUM_ATTRIBUTES)

(defn initialize
  "Must be called before attempting to read records.

  conf - DataVec configuration - `org.datavec.api.conf.Configuration`
  split - FileSplit - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^SVMLightRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split))))

(defn set-conf
  "Set configuration.

  conf - DataVec configuration - `org.datavec.api.conf.Configuration`

  throws: java.io.IOException"
  ([^SVMLightRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^SVMLightRecordReader this]
    (-> this (.hasNext))))

(defn next
  "Return next record as list of Writables.

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^SVMLightRecordReader this]
    (-> this (.next))))

(defn next-record
  "Return next Record.

  returns: `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^SVMLightRecordReader this]
    (-> this (.nextRecord))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^SVMLightRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^SVMLightRecordReader this]
    (-> this (.reset))))

