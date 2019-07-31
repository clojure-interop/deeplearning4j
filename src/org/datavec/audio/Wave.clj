(ns org.datavec.audio.Wave
  "Read WAVE headers and data from wave input stream"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio Wave]))

(defn ->wave
  "Constructor.

  Constructor

  wave-header - `org.datavec.audio.WaveHeader`
  data - `byte[]`"
  (^Wave [^org.datavec.audio.WaveHeader wave-header data]
    (new Wave wave-header data))
  (^Wave [^java.lang.String filename]
    (new Wave filename))
  (^Wave []
    (new Wave )))

(defn trim
  "Trim the wave data

  left-trim-number-of-sample - Number of sample trimmed from beginning - `int`
  right-trim-number-of-sample - Number of sample trimmed from ending - `int`"
  ([^Wave this ^Integer left-trim-number-of-sample ^Integer right-trim-number-of-sample]
    (-> this (.trim left-trim-number-of-sample right-trim-number-of-sample))))

(defn get-fingerprint
  "returns: `byte[]`"
  ([^Wave this]
    (-> this (.getFingerprint))))

(defn left-trim
  "Trim the wave data from beginning

  number-of-sample - numberOfSample trimmed from beginning - `int`"
  ([^Wave this ^Integer number-of-sample]
    (-> this (.leftTrim number-of-sample))))

(defn timestamp
  "Timestamp of the wave length

  returns: timestamp - `java.lang.String`"
  (^java.lang.String [^Wave this]
    (-> this (.timestamp))))

(defn get-fingerprint-similarity
  "wave - `org.datavec.audio.Wave`

  returns: `org.datavec.audio.fingerprint.FingerprintSimilarity`"
  (^org.datavec.audio.fingerprint.FingerprintSimilarity [^Wave this ^org.datavec.audio.Wave wave]
    (-> this (.getFingerprintSimilarity wave))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Wave this]
    (-> this (.toString))))

(defn get-bytes
  "Get the wave data in bytes

  returns: wave data - `byte[]`"
  ([^Wave this]
    (-> this (.getBytes))))

(defn get-spectrogram
  "Get the wave spectrogram

  fft-sample-size - number of sample in fft, the value needed to be a number to power of 2 - `int`
  overlap-factor - 1/overlapFactor overlapping, e.g. 1/4=25% overlapping, 0 for no overlapping - `int`

  returns: spectrogram - `org.datavec.audio.extension.Spectrogram`"
  (^org.datavec.audio.extension.Spectrogram [^Wave this ^Integer fft-sample-size ^Integer overlap-factor]
    (-> this (.getSpectrogram fft-sample-size overlap-factor)))
  (^org.datavec.audio.extension.Spectrogram [^Wave this]
    (-> this (.getSpectrogram))))

(defn get-sample-amplitudes
  "Get the amplitudes of the wave samples (depends on the header)

  returns: amplitudes array (signed 16-bit) - `short[]`"
  ([^Wave this]
    (-> this (.getSampleAmplitudes))))

(defn length
  "Length of the wave in second

  returns: length in second - `float`"
  (^Float [^Wave this]
    (-> this (.length))))

(defn get-wave-header
  "Get the wave header

  returns: waveHeader - `org.datavec.audio.WaveHeader`"
  (^org.datavec.audio.WaveHeader [^Wave this]
    (-> this (.getWaveHeader))))

(defn get-normalized-amplitudes
  "returns: `double[]`"
  ([^Wave this]
    (-> this (.getNormalizedAmplitudes))))

(defn size
  "Data byte size of the wave excluding header size

  returns: byte size of the wave - `int`"
  (^Integer [^Wave this]
    (-> this (.size))))

(defn right-trim
  "Trim the wave data from ending

  number-of-sample - numberOfSample trimmed from ending - `int`"
  ([^Wave this ^Integer number-of-sample]
    (-> this (.rightTrim number-of-sample))))

