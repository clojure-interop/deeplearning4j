(ns org.datavec.codec.reader.NativeCodecRecordReader
  "An implementation of the CodecRecordReader that uses JavaCV and FFmpeg."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.codec.reader NativeCodecRecordReader]))

(defn ->native-codec-record-reader
  "Constructor."
  (^NativeCodecRecordReader []
    (new NativeCodecRecordReader )))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^NativeCodecRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

