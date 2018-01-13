namespace CatEars
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.serialPort1 = new System.IO.Ports.SerialPort(this.components);
            this.uxAddCat = new System.Windows.Forms.Button();
            this.uxCatList = new System.Windows.Forms.ListBox();
            this.SuspendLayout();
            // 
            // uxAddCat
            // 
            this.uxAddCat.Location = new System.Drawing.Point(749, 12);
            this.uxAddCat.Name = "uxAddCat";
            this.uxAddCat.Size = new System.Drawing.Size(75, 23);
            this.uxAddCat.TabIndex = 0;
            this.uxAddCat.Text = "Add &Cat";
            this.uxAddCat.UseVisualStyleBackColor = true;
            this.uxAddCat.Click += new System.EventHandler(this.uxAddCat_Click);
            // 
            // uxCatList
            // 
            this.uxCatList.FormattingEnabled = true;
            this.uxCatList.Location = new System.Drawing.Point(12, 12);
            this.uxCatList.Name = "uxCatList";
            this.uxCatList.Size = new System.Drawing.Size(120, 95);
            this.uxCatList.TabIndex = 1;
            this.uxCatList.DoubleClick += new System.EventHandler(this.uxCatList_DoubleClick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(836, 624);
            this.Controls.Add(this.uxCatList);
            this.Controls.Add(this.uxAddCat);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.IO.Ports.SerialPort serialPort1;
        private System.Windows.Forms.Button uxAddCat;
        private System.Windows.Forms.ListBox uxCatList;
    }
}

