(ns org.datavec.codec.reader.CodecRecordReader
  "Codec record reader for parsing:
 H.264 ( AVC ) Main profile decoder MP3 decoder/encoder
 Apple ProRes decoder and encoder AAC encoder
 H264 Baseline profile encoder
 Matroska ( MKV ) demuxer and muxer
 MP4 ( ISO BMF, QuickTime ) demuxer/muxer and tools
 MPEG 1/2 decoder ( supports interlace )
 MPEG PS/TS demuxer
 Java player applet
 VP8 encoder
 MXF demuxer
 Credit to jcodec for the underlying parser"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.codec.reader CodecRecordReader]))

(defn ->codec-record-reader
  "Constructor."
  (^CodecRecordReader []
    (new CodecRecordReader )))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^CodecRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

