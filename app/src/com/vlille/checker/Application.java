package com.vlille.checker;

import android.util.Log;

import com.vlille.checker.utils.Constants;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;
import org.droidparts.AbstractApplication;

@ReportsCrashes(
	formKey = Constants.GOOGLE_DOCS_FORM_KEY,
    mode = ReportingInteractionMode.TOAST,
    forceCloseDialogAfterToast = false,
    resToastText = R.string.crash_toast_text
)
public class Application extends AbstractApplication {

	@Override
	public void onCreate() {
        super.onCreate();

        ACRA.init(this);
	}

}