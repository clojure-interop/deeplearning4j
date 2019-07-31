(ns org.datavec.image.recordreader.ImageRecordReader
  "Image record reader.
 Reads a local file system and parses images of a given
 height and width.
 All images are rescaled and converted to the given height, width, and number of channels.
 Also appends the label if specified
 (one of k encoding based on the directory structure where each subdir of the root is an indexed label)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.recordreader ImageRecordReader]))

(defn ->image-record-reader
  "Constructor.

  Loads images with given height, width, and channels, appending labels returned by the generator.

  height - `long`
  width - `long`
  channels - `long`
  label-generator - `org.datavec.api.io.labels.PathLabelGenerator`
  image-transform - `org.datavec.image.transform.ImageTransform`"
  (^ImageRecordReader [^Long height ^Long width ^Long channels ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^org.datavec.image.transform.ImageTransform image-transform]
    (new ImageRecordReader height width channels label-generator image-transform))
  (^ImageRecordReader [^Long height ^Long width ^Long channels ^org.datavec.api.io.labels.PathLabelGenerator label-generator]
    (new ImageRecordReader height width channels label-generator))
  (^ImageRecordReader [^Long height ^Long width ^Long channels]
    (new ImageRecordReader height width channels))
  (^ImageRecordReader [^Long height ^Long width]
    (new ImageRecordReader height width))
  (^ImageRecordReader []
    (new ImageRecordReader )))

