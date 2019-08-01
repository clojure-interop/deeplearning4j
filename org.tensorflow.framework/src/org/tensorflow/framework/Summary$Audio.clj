(ns org.tensorflow.framework.Summary$Audio
  "Protobuf type tensorflow.Summary.Audio"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$Audio]))

(def *-sample-rate-field-number
  "Static Constant.

  type: int"
  Summary$Audio/SAMPLE_RATE_FIELD_NUMBER)

(def *-num-channels-field-number
  "Static Constant.

  type: int"
  Summary$Audio/NUM_CHANNELS_FIELD_NUMBER)

(def *-length-frames-field-number
  "Static Constant.

  type: int"
  Summary$Audio/LENGTH_FRAMES_FIELD_NUMBER)

(def *-encoded-audio-string-field-number
  "Static Constant.

  type: int"
  Summary$Audio/ENCODED_AUDIO_STRING_FIELD_NUMBER)

(def *-content-type-field-number
  "Static Constant.

  type: int"
  Summary$Audio/CONTENT_TYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (Summary$Audio/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Audio`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.Summary$Audio [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (Summary$Audio/parseFrom data extension-registry))
  (^org.tensorflow.framework.Summary$Audio [^java.nio.ByteBuffer data]
    (Summary$Audio/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Audio`

  throws: java.io.IOException"
  (^org.tensorflow.framework.Summary$Audio [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (Summary$Audio/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.Summary$Audio [^java.io.InputStream input]
    (Summary$Audio/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.Summary$Audio`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^org.tensorflow.framework.Summary$Audio prototype]
    (Summary$Audio/newBuilder prototype))
  (^org.tensorflow.framework.Summary$Audio$Builder []
    (Summary$Audio/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.Summary$Audio`"
  (^org.tensorflow.framework.Summary$Audio []
    (Summary$Audio/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.Summary$Audio>`"
  (^com.github.os72.protobuf351.Parser []
    (Summary$Audio/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^Summary$Audio this]
    (-> this (.getUnknownFields))))

(defn get-sample-rate
  "Sample rate of the audio in Hz.
  float sample_rate = 1;

  returns: `float`"
  (^Float [^Summary$Audio this]
    (-> this (.getSampleRate))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Summary$Audio this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.Summary$Audio`"
  (^org.tensorflow.framework.Summary$Audio [^Summary$Audio this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^Summary$Audio this]
    (-> this (.getSerializedSize))))

(defn get-content-type-bytes
  "string content_type = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Audio this]
    (-> this (.getContentTypeBytes))))

(defn get-content-type
  "string content_type = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$Audio this]
    (-> this (.getContentType))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^Summary$Audio this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-length-frames
  "Length of the audio in frames (samples per channel).
  int64 length_frames = 3;

  returns: `long`"
  (^Long [^Summary$Audio this]
    (-> this (.getLengthFrames))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Summary$Audio this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.Summary$Audio>`"
  (^com.github.os72.protobuf351.Parser [^Summary$Audio this]
    (-> this (.getParserForType))))

(defn get-num-channels
  "Number of channels of audio.
  int64 num_channels = 2;

  returns: `long`"
  (^Long [^Summary$Audio this]
    (-> this (.getNumChannels))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Summary$Audio this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio this]
    (-> this (.newBuilderForType))))

(defn get-encoded-audio-string
  "Encoded audio data and its associated RFC 2045 content type (e.g.
   \"audio/wav\").
  bytes encoded_audio_string = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Audio this]
    (-> this (.getEncodedAudioString))))

(defn to-builder
  "returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio this]
    (-> this (.toBuilder))))

