(ns org.datavec.image.recordreader.BaseImageRecordReader
  "Base class for the image record reader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.recordreader BaseImageRecordReader]))

(defn ->base-image-record-reader
  "Constructor.

  height - `long`
  width - `long`
  channels - `long`
  label-generator - `org.datavec.api.io.labels.PathLabelGenerator`
  image-transform - `org.datavec.image.transform.ImageTransform`"
  (^BaseImageRecordReader [^Long height ^Long width ^Long channels ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^org.datavec.image.transform.ImageTransform image-transform]
    (new BaseImageRecordReader height width channels label-generator image-transform))
  (^BaseImageRecordReader [^Long height ^Long width ^Long channels ^org.datavec.api.io.labels.PathLabelGenerator label-generator]
    (new BaseImageRecordReader height width channels label-generator))
  (^BaseImageRecordReader []
    (new BaseImageRecordReader )))

(def *-height
  "Static Constant.

  type: java.lang.String"
  BaseImageRecordReader/HEIGHT)

(def *-width
  "Static Constant.

  type: java.lang.String"
  BaseImageRecordReader/WIDTH)

(def *-channels
  "Static Constant.

  type: java.lang.String"
  BaseImageRecordReader/CHANNELS)

(def *-crop-image
  "Static Constant.

  type: java.lang.String"
  BaseImageRecordReader/CROP_IMAGE)

(def *-image-loader
  "Static Constant.

  type: java.lang.String"
  BaseImageRecordReader/IMAGE_LOADER)

(defn set-labels
  "labels - `java.util.List`"
  ([^BaseImageRecordReader this ^java.util.List labels]
    (-> this (.setLabels labels))))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^BaseImageRecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^BaseImageRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^BaseImageRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^BaseImageRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^BaseImageRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^BaseImageRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^BaseImageRecordReader this]
    (-> this (.nextRecord))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^BaseImageRecordReader this]
    (-> this (.batchesSupported))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseImageRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^BaseImageRecordReader this]
    (-> this (.hasNext))))

(defn get-label
  "Get the label from the given path

  path - the path to get the label from - `java.lang.String`

  returns: the label for the given path - `java.lang.String`"
  (^java.lang.String [^BaseImageRecordReader this ^java.lang.String path]
    (-> this (.getLabel path))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^BaseImageRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^BaseImageRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "throws: java.io.IOException"
  ([^BaseImageRecordReader this]
    (-> this (.close))))

(defn initialize
  "Called once at initialization.

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`
  image-transform - the image transform to use to transform images while loading them - `org.datavec.image.transform.ImageTransform`

  throws: java.io.IOException"
  ([^BaseImageRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split ^org.datavec.image.transform.ImageTransform image-transform]
    (-> this (.initialize conf split image-transform)))
  ([^BaseImageRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^BaseImageRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

(defn num-labels
  "Returns getLabels().size().

  returns: `int`"
  (^Integer [^BaseImageRecordReader this]
    (-> this (.numLabels))))

(defn set-current-file
  "Sets manually the file returned by getCurrentFile().

  current-file - `java.io.File`"
  ([^BaseImageRecordReader this ^java.io.File current-file]
    (-> this (.setCurrentFile current-file))))

(defn get-current-file
  "Returns the file loaded last by next().

  returns: `java.io.File`"
  (^java.io.File [^BaseImageRecordReader this]
    (-> this (.getCurrentFile))))

