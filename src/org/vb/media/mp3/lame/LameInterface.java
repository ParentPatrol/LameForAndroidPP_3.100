
package org.vb.media.mp3.lame;

/**
 * LAME interface class
 */
public class LameInterface {

	/**
	 * Initialize LAME encoder with audio channels parameters.
	 * 
	 * @param inputSR
	 *            input sample rate, Hz.
	 * @param chNumber
	 *            number of channels (1 - mono, 2 - stereo).
	 * @param outputSR
	 *            output sample rate, Hz.
	 * @param outputBitrate
	 *            brate compression ratio, kb/s.
	 *            
	 * @return init code. Check that result >= 0.
	 */
	public static int initLame(int inputSR, int chNumber,	int outputSR, int outputBitrate) {
		return initLame(inputSR, chNumber, outputSR, outputBitrate, 5);
	}

	/**
	 * Initialize LAME.
	 * 
	 * @param inputSR
	 *            input sample rate, Hz.
	 * @param chNumber
	 *            number of channels (1 - mono, 2 - stereo).
	 * @param outputSR
	 *            output sample rate, Hz.
	 * @param outputBitrate
	 *            brate compression ratio, kb/s.
	 * @param quality
	 *            quality=0..9. 0=best. 9=worst.<br />
	 *            recommended:<br />
	 *            2 near-best quality, not too slow<br />
	 *            5 good quality, fast<br />
	 *            7 ok quality, really fast
	 *            
	 * @return init code. Check that result >= 0.
	 * 
	 */
	public native static int initLame(int inputSR, int chNumber, int outputSR, int outputBitrate, int quality);

	/**
	 * Encode buffer to mp3.
	 * 
	 * @param inDataL
	 *            PCM data for left channel.
	 * @param inDataR
	 *            PCM data for right channel.
	 * @param samblesNum
	 *            number of samples per channel.
	 * @param mp3BufOutput
	 *            encoded MP3 buffer
	 * @return number of bytes output in mp3BufOutput.<br /> Valid values:<br /> 0.<br />
	 *         -1: mp3BufOutput was too small<br />
	 *         -2: malloc() problem<br />
	 *         -3: lame_init_params() was not called<br />
	 *         -4: psycho acoustic problems        
	 * 
	 */
	public native static int encodeBuffer(short[] inDataL, short[] inDataR,	int samplesNum, byte[] mp3BufOutput);

	/**
	 * Flush LAME buffer.
	 * 
	 * @param mp3BufOutput
	 *            result encoded MP3 stream (7200 recommended with some additional size)
	 *            bytes.
	 *            
	 * @return number of bytes output to mp3BufOutput. Can be 0.
	 */
	public native static int encodeFlush(byte[] mp3BufOutput);

	/**
	 * Close LAME.
	 */
	public native static void close();
}
