(ns org.datavec.api.records.reader.impl.jackson.JacksonRecordReader
  "RecordReader using Jackson.
 Design for this record reader:
 - Support for JSON, XML and YAML: one record per file only, via Jackson ObjectMapper:

 - JSON: new ObjectMapper(new JsonFactory())
 - YAML: new ObjectMapper(new YAMLFactory()) (requires jackson-dataformat-yaml dependency)
 - XML: new ObjectMapper(new XmlFactory()) (requires jackson-dataformat-xml dependency)

 - User provides a list of fields to load, using FieldSelection. This complicates configuration for simple structures
 (user has to specify every field to load), however this allows us to parse files where:

 - The fields in the json/xml/yaml is not in a consistent order (for example, JSON makes no guarantees about order).
 The order of output fields is provided via the FieldSelection object.
 - Fields may be missing in some files (output will include an (optionally) specified writable for the missing value,
 defined again in FieldSelection)
 - The fields in the json/yaml/xml files may have arbitrary nested structure: For example, a: b: c: d: someValue

 - Optional support for appending a label based on the path of the file, using PathLabelGenerator
 - Support for shuffling of records (with an optional RNG seed)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.jackson JacksonRecordReader]))

(defn ->jackson-record-reader
  "Constructor.

  selection - `org.datavec.api.records.reader.impl.jackson.FieldSelection`
  mapper - `org.nd4j.shade.jackson.databind.ObjectMapper`
  shuffle - `boolean`
  rng-seed - `long`
  label-generator - `org.datavec.api.io.labels.PathLabelGenerator`
  label-position - `int`"
  (^JacksonRecordReader [^org.datavec.api.records.reader.impl.jackson.FieldSelection selection ^org.nd4j.shade.jackson.databind.ObjectMapper mapper ^Boolean shuffle ^Long rng-seed ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Integer label-position]
    (new JacksonRecordReader selection mapper shuffle rng-seed label-generator label-position))
  (^JacksonRecordReader [^org.datavec.api.records.reader.impl.jackson.FieldSelection selection ^org.nd4j.shade.jackson.databind.ObjectMapper mapper ^Boolean shuffle ^Long rng-seed ^org.datavec.api.io.labels.PathLabelGenerator label-generator]
    (new JacksonRecordReader selection mapper shuffle rng-seed label-generator))
  (^JacksonRecordReader [^org.datavec.api.records.reader.impl.jackson.FieldSelection selection ^org.nd4j.shade.jackson.databind.ObjectMapper mapper ^Boolean shuffle]
    (new JacksonRecordReader selection mapper shuffle))
  (^JacksonRecordReader [^org.datavec.api.records.reader.impl.jackson.FieldSelection selection ^org.nd4j.shade.jackson.databind.ObjectMapper mapper]
    (new JacksonRecordReader selection mapper)))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^JacksonRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^JacksonRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^JacksonRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^JacksonRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^JacksonRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^JacksonRecordReader this]
    (-> this (.nextRecord))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^JacksonRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^JacksonRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^JacksonRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^JacksonRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "throws: java.io.IOException"
  ([^JacksonRecordReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^JacksonRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^JacksonRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

