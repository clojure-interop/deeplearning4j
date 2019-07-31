(ns org.datavec.audio.recordreader.NativeAudioRecordReader
  "Native audio file loader using FFmpeg."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.recordreader NativeAudioRecordReader]))

(defn ->native-audio-record-reader
  "Constructor.

  append-label - `boolean`
  labels - `java.util.List`"
  (^NativeAudioRecordReader [^Boolean append-label ^java.util.List labels]
    (new NativeAudioRecordReader append-label labels))
  (^NativeAudioRecordReader [^java.util.List labels]
    (new NativeAudioRecordReader labels))
  (^NativeAudioRecordReader []
    (new NativeAudioRecordReader )))

