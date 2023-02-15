package commons.extensions

import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

fun Fragment.showConfirmationDialog(
    title: String?,
    message: String?,
    onPositiveClick: () -> Unit,
    onNegativeClick: () -> Unit
) {
    AlertDialog.Builder(requireContext())
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(getString(android.R.string.ok)) { _, _ ->
            onPositiveClick()
        }
        .setNegativeButton(getString(android.R.string.cancel)) { _, _ ->
            onNegativeClick()
        }
        .show()
}