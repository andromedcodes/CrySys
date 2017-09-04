package com.github.andromedcodes.crysys.engine;

import com.github.andromedcodes.crysys.engine.algorithms.XOR;

/**
 * Created by mohamed on 04/09/2017.
 */

public class CrySys {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public static CrySys mInstance = null;
    public XOR XOREncrypter;

    private CrySys() {
        XOREncrypter = new XOR();
    }

    /***
     * Get singleton instance
     * @return CrySys Object Instance
     */
    public static CrySys getInstance() {
        if (mInstance == null)
            mInstance = new CrySys();
        return mInstance;
    }

}
