(ns org.datavec.audio.recordreader.WavFileRecordReader
  "Wav file loader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.recordreader WavFileRecordReader]))

(defn ->wav-file-record-reader
  "Constructor.

  append-label - `boolean`
  labels - `java.util.List`"
  (^WavFileRecordReader [^Boolean append-label ^java.util.List labels]
    (new WavFileRecordReader append-label labels))
  (^WavFileRecordReader [^java.util.List labels]
    (new WavFileRecordReader labels))
  (^WavFileRecordReader []
    (new WavFileRecordReader )))

