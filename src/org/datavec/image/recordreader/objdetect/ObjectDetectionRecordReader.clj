(ns org.datavec.image.recordreader.objdetect.ObjectDetectionRecordReader
  "An image record reader for object detection.

 Format of returned values: 4d array, with dimensions [minibatch, 4+C, h, w]
 Where the image is quantized into h x w grid locations.

 Note that this matches the format required for Deeplearning4j's Yolo2OutputLayer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.recordreader.objdetect ObjectDetectionRecordReader]))

(defn ->object-detection-record-reader
  "Constructor.

  When imageTransform != null, object is removed if new center is outside of transformed image bounds.

  height - Height of the output images - `int`
  width - Width of the output images - `int`
  channels - Number of channels for the output images - `int`
  grid-h - Grid/quantization size (along height dimension) - Y axis - `int`
  grid-w - Grid/quantization size (along height dimension) - X axis - `int`
  label-provider - ImageObjectLabelProvider - used to look up which objects are in each image - `org.datavec.image.recordreader.objdetect.ImageObjectLabelProvider`
  image-transform - ImageTransform - used to transform image and coordinates - `org.datavec.image.transform.ImageTransform`"
  (^ObjectDetectionRecordReader [^Integer height ^Integer width ^Integer channels ^Integer grid-h ^Integer grid-w ^org.datavec.image.recordreader.objdetect.ImageObjectLabelProvider label-provider ^org.datavec.image.transform.ImageTransform image-transform]
    (new ObjectDetectionRecordReader height width channels grid-h grid-w label-provider image-transform))
  (^ObjectDetectionRecordReader [^Integer height ^Integer width ^Integer channels ^Integer grid-h ^Integer grid-w ^org.datavec.image.recordreader.objdetect.ImageObjectLabelProvider label-provider]
    (new ObjectDetectionRecordReader height width channels grid-h grid-w label-provider)))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ObjectDetectionRecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^ObjectDetectionRecordReader this]
    (-> this (.next))))

(defn initialize
  "Description copied from interface: RecordReader

  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^ObjectDetectionRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^ObjectDetectionRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^ObjectDetectionRecordReader this]
    (-> this (.nextRecord))))

