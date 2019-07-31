(ns org.tensorflow.framework.Summary$AudioOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$AudioOrBuilder]))

(defn get-sample-rate
  "Sample rate of the audio in Hz.
  float sample_rate = 1;

  returns: `float`"
  (^Float [^Summary$AudioOrBuilder this]
    (-> this (.getSampleRate))))

(defn get-num-channels
  "Number of channels of audio.
  int64 num_channels = 2;

  returns: `long`"
  (^Long [^Summary$AudioOrBuilder this]
    (-> this (.getNumChannels))))

(defn get-length-frames
  "Length of the audio in frames (samples per channel).
  int64 length_frames = 3;

  returns: `long`"
  (^Long [^Summary$AudioOrBuilder this]
    (-> this (.getLengthFrames))))

(defn get-encoded-audio-string
  "Encoded audio data and its associated RFC 2045 content type (e.g.
   \"audio/wav\").
  bytes encoded_audio_string = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$AudioOrBuilder this]
    (-> this (.getEncodedAudioString))))

(defn get-content-type
  "string content_type = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$AudioOrBuilder this]
    (-> this (.getContentType))))

(defn get-content-type-bytes
  "string content_type = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$AudioOrBuilder this]
    (-> this (.getContentTypeBytes))))

