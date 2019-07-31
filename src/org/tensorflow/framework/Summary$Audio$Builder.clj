(ns org.tensorflow.framework.Summary$Audio$Builder
  "Protobuf type tensorflow.Summary.Audio"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$Audio$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (Summary$Audio$Builder/getDescriptor )))

(defn clear-sample-rate
  "Sample rate of the audio in Hz.
  float sample_rate = 1;

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this]
    (-> this (.clearSampleRate))))

(defn get-sample-rate
  "Sample rate of the audio in Hz.
  float sample_rate = 1;

  returns: `float`"
  (^Float [^Summary$Audio$Builder this]
    (-> this (.getSampleRate))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.Summary$Audio`"
  (^org.tensorflow.framework.Summary$Audio [^Summary$Audio$Builder this]
    (-> this (.buildPartial))))

(defn set-content-type
  "string content_type = 5;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^java.lang.String value]
    (-> this (.setContentType value))))

(defn clear-content-type
  "string content_type = 5;

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this]
    (-> this (.clearContentType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Summary$Audio$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.Summary$Audio`"
  (^org.tensorflow.framework.Summary$Audio [^Summary$Audio$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-sample-rate
  "Sample rate of the audio in Hz.
  float sample_rate = 1;

  value - `float`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^Float value]
    (-> this (.setSampleRate value))))

(defn set-length-frames
  "Length of the audio in frames (samples per channel).
  int64 length_frames = 3;

  value - `long`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^Long value]
    (-> this (.setLengthFrames value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-length-frames
  "Length of the audio in frames (samples per channel).
  int64 length_frames = 3;

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this]
    (-> this (.clearLengthFrames))))

(defn get-content-type-bytes
  "string content_type = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Audio$Builder this]
    (-> this (.getContentTypeBytes))))

(defn get-content-type
  "string content_type = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$Audio$Builder this]
    (-> this (.getContentType))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-content-type-bytes
  "string content_type = 5;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setContentTypeBytes value))))

(defn set-num-channels
  "Number of channels of audio.
  int64 num_channels = 2;

  value - `long`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^Long value]
    (-> this (.setNumChannels value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn set-encoded-audio-string
  "Encoded audio data and its associated RFC 2045 content type (e.g.
   \"audio/wav\").
  bytes encoded_audio_string = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setEncodedAudioString value))))

(defn build
  "returns: `org.tensorflow.framework.Summary$Audio`"
  (^org.tensorflow.framework.Summary$Audio [^Summary$Audio$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-num-channels
  "Number of channels of audio.
  int64 num_channels = 2;

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this]
    (-> this (.clearNumChannels))))

(defn clear-encoded-audio-string
  "Encoded audio data and its associated RFC 2045 content type (e.g.
   \"audio/wav\").
  bytes encoded_audio_string = 4;

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this]
    (-> this (.clearEncodedAudioString))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^Summary$Audio$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-length-frames
  "Length of the audio in frames (samples per channel).
  int64 length_frames = 3;

  returns: `long`"
  (^Long [^Summary$Audio$Builder this]
    (-> this (.getLengthFrames))))

(defn clear
  "returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this]
    (-> this (.clear))))

(defn get-num-channels
  "Number of channels of audio.
  int64 num_channels = 2;

  returns: `long`"
  (^Long [^Summary$Audio$Builder this]
    (-> this (.getNumChannels))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Audio$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-encoded-audio-string
  "Encoded audio data and its associated RFC 2045 content type (e.g.
   \"audio/wav\").
  bytes encoded_audio_string = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Audio$Builder this]
    (-> this (.getEncodedAudioString))))

