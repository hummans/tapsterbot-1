/*
    MIT License
    Copyright (c) 2018 Pierre-Yves Lapersonne (Mail: dev@pylapersonne.info)
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
 */
// ✿✿✿✿ ʕ •ᴥ•ʔ/ ︻デ═一

package pylapp.tapster.client.android.assistants

import android.app.Activity
import android.content.Context

/**
 * Stub based on design pattern Bridge which provides the declarations of methods to call
 * so as to deal with an object which can make notifications to the user interface.
 * This pattern is used so as to avoid the assistant to have too many dependencies and code about the UI.
 *
 * @author Pierre-Yves Lapersonne
 * @since 06/02/2018
 *
 * @version 1.0.0
 */
interface UiNotifierStub {

    /* ******************* *
     * METHODS TO OVERRIDE *
     * ******************* */

    /**
     * Displays in the GUI the messages
     *
     * @param context - The context to use
     * @param type - The type of the message
     * @param message - The string to display
     */
    fun displayMessage(context: Activity, type: AssistantMessage.Type, message: String)

    /**
     * Toasts a message
     *
     * @param context - The context to use
     * @param type - The type of the message
     * @param message - The string to display
     */
    fun toastMessage(context: Activity, type: AssistantMessage.Type, message: String)

    /**
     * Allows the caller of this function to clean the notifier
     */
    fun cleanup()

    /**
     * Vibrates to notify a new state to the user
     *
     * @param context - To get the vibrator service
     * @param duration - The duration of the vibration (in ms)
     */
    fun vibrate(context: Context, duration: Long)

}
